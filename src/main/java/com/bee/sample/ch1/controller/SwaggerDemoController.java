package com.bee.sample.ch1.controller;

import com.bee.sample.ch1.entity.ResponseInfo;
import com.bee.sample.ch1.entity.RestaurantEntity;
import com.bee.sample.ch1.service.RestaurantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@Api("SwaggerDemoController相关api")
public class SwaggerDemoController {

    @Autowired
    private RestaurantService restaurantService;

    @ApiOperation(value = "获取名称",notes = "查询名称")
    @ApiImplicitParam(name = "id",value = "id",paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getName(@PathVariable String id){
        return id;
    }

    //新增
    @ApiOperation(value = "新增餐馆",notes = "新增餐馆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "restaurantId",value = "restaurantId", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "name",value = "name", required = true, dataType = "String")})
    @RequestMapping(value = "/addAndUpdateRestaurant",method = RequestMethod.POST)
    @ResponseBody
    public ResponseInfo addAndUpdateRestaurant(RestaurantEntity entity){
        ResponseInfo responseInfo = new ResponseInfo();

        restaurantService.addAndUpdateRestaurant(entity);

        responseInfo.setCode(1);
        responseInfo.setMessage("success");
        return responseInfo;
    }
}
