package com.fly.controller.base;

import com.fly.service.base.BaseService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public abstract class BaseController<Entity, EntityExample, ID, QueryVo> {

    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String FAILURE = "failure";
    public static final String NONE = null;

    public abstract BaseService<Entity, EntityExample, ID> getBaseService();

    /**
     * 通过ID删除对象
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteById(@PathVariable("id") ID id) {
        getBaseService().deleteByPrimaryKey(id);
        return SUCCESS;
    }

    /**
     * 插入一个对象
     * @param entity
     * @return
     */
    @PostMapping
    @ResponseBody
    public String insert(Entity entity) {
        getBaseService().insert(entity);
        return SUCCESS;
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @GetMapping("/{id}/json")
    @ResponseBody
    public Entity selectById(@PathVariable("id") ID id) {
        return getBaseService().selectByPrimaryKey(id);
    }

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/json")
    @ResponseBody
    public List<Entity> selectAll() {
        return getBaseService().selectByExample(null);
    }

    /**
     * 条件查询
     * @param vo
     * @return
     */
    @RequestMapping(value = "/search/json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<Entity> selectByExample(QueryVo vo) {
        return getBaseService().selectByExample(getExample(vo));
    }

    /**
     * 更新一个对象
     * @param entity
     * @return
     */
    @PutMapping
    @ResponseBody
    public String update(Entity entity) {
        getBaseService().updateByPrimaryKey(entity);
        return SUCCESS;
    }

    /**
     * 留给子类重写
     * 实现条件查询
     * @param vo
     * @return
     */
    protected EntityExample getExample(QueryVo vo) {
        return null;
    }
}
