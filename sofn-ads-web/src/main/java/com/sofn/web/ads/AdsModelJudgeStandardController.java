package com.sofn.web.ads;

import com.github.pagehelper.PageInfo;
import com.sofn.core.annotation.SystemControllerLog;
import com.sofn.core.base.BaseController;
import com.sofn.core.constant.ApiConstants;
import com.sofn.core.constant.ApiMsgConstants;

import com.sofn.core.constant.CurrentUser;
import com.sofn.core.constant.HttpCode;
import com.sofn.core.support.Assert;
import com.sofn.core.util.WebUtil;
import com.sofn.model.generator.AdsModelJudgeStandard;
import com.sofn.service.ads.AdsModelJudgeStandardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
*	模型_判定标准 controller 控制器实现
 * Created by moon.l 
 */
@RestController
@Api(value = "模型_判定标准", description = "模型_判定标准")
@RequestMapping(value = "/adsModelJudgeStandard",method = RequestMethod.POST)
public class AdsModelJudgeStandardController extends BaseController {

	@Autowired
    private AdsModelJudgeStandardService adsModelJudgeStandardService;
    
     /**
     * 根据条件获取模型_判定标准列表
     * @param adsModelJudgeStandard
     * @return
     */
    @ApiOperation(value = "获取模型_判定标准信息列表")
    @RequestMapping(value = "/getPageInfo",method = RequestMethod.POST)
    public Object getPageInfo(AdsModelJudgeStandard adsModelJudgeStandard, int start, int length) {
    	try{
    		PageInfo<AdsModelJudgeStandard> pageInfo =adsModelJudgeStandardService.getPageInfo(adsModelJudgeStandard,((start+1)/length)+1,length);
    		return setSuccessModelMap(new ModelMap(),pageInfo);
    	}catch (Exception e){
            return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
        }
    }

	/**
     * 新增模型_判定标准记录
     * @param adsModelJudgeStandard
     * @return
     */
    @ApiOperation(value = "新增模型_判定标准数据")
    @SystemControllerLog(description = "新增模型_判定标准数据")
    @RequestMapping(value = "/addAdsModelJudgeStandard",method = RequestMethod.POST)
    public Object addAdsModelJudgeStandard(AdsModelJudgeStandard  adsModelJudgeStandard,String token){
        //token
    	try{
            Assert.isNotBlank(token,"token");
            CurrentUser u= WebUtil.getCurrentUser(token);
            adsModelJudgeStandard.setCreateBy(u.getId());   //设置创建人id
            AdsModelJudgeStandard judgeStandard=adsModelJudgeStandardService.add(adsModelJudgeStandard);
    		return setSuccessModelMap(new ModelMap(),judgeStandard);
    	}catch (Exception e){
            logger.error("AdsModelJudgeStandardController.addAdsModelJudgeStandard:新增模型_判定标准数据异常",e); //日志服务器抓取数据
            return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
        }
    }


	 /**
     * 根据ID获取单条模型_判定标准数据信息
     * @param adsModelJudgeStandard
     * @return
     */
    @ApiOperation(value = "获取单条模型_判定标准数据信息")
    @RequestMapping(value = "/queryById",method = RequestMethod.POST)
    public Map<String,Object> queryById(AdsModelJudgeStandard  adsModelJudgeStandard){
        adsModelJudgeStandard = adsModelJudgeStandardService.queryById(adsModelJudgeStandard.getId());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(ApiConstants.CODE, ApiMsgConstants.SUCCESS_CODE);
        map.put(ApiConstants.MSG, ApiMsgConstants.SUCCESS_MSG);
        map.put("adsModelJudgeStandard",adsModelJudgeStandard);
        return map;
    }
    
     /**
     * 修改模型_判定标准数据信息
     * @param adsModelJudgeStandard
     * @return
     */
    @ApiOperation(value = "修改模型_判定标准数据信息")
    @SystemControllerLog(description = "修改模型_判定标准数据信息")
    @RequestMapping(value = "/updateAdsModelJudgeStandard",method = RequestMethod.POST)
    public Object updateAdsModelJudgeStandard(AdsModelJudgeStandard adsModelJudgeStandard,String token){
      	try{
            Assert.isNotBlank(token,"token");
            CurrentUser u= WebUtil.getCurrentUser(token);
            adsModelJudgeStandard.setUpdateBy(u.getId());
    		adsModelJudgeStandardService.update(adsModelJudgeStandard);
    		return setSuccessModelMap(new ModelMap());
    	}catch (Exception e){
            logger.error("AdsModelJudgeStandardController.updateAdsModelJudgeStandard:修改模型_判定标准数据信息异常",e); //日志服务器抓取数据
            return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
        }
    }
    
    
     /**
     * 删除模型_判定标准信息
     * @param adsModelJudgeStandard
     * @return
     */
    @ApiOperation(value = "删除模型_判定标准信息")
    @SystemControllerLog(description = "删除模型_判定标准信息")
    @RequestMapping(value = "/deleteAdsModelJudgeStandard",method = RequestMethod.POST)
    public Object deleteAdsModelJudgeStandard(AdsModelJudgeStandard adsModelJudgeStandard,String token){
   	    try{
            Assert.isNotBlank(token,"token");
            CurrentUser u= WebUtil.getCurrentUser(token);
            adsModelJudgeStandard.setUpdateBy(u.getId());
    		adsModelJudgeStandardService.delete(adsModelJudgeStandard.getId());
    		return setSuccessModelMap(new ModelMap());
    	}catch (Exception e){
            logger.error("AdsModelJudgeStandardController.deleteAdsModelJudgeStandard:删除模型_判定标准信息异常",e); //日志服务器抓取数据
            return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 批量删除模型_判定标准信息
     * @param adsModelJudgeStandard
     * @return
     */
    @ApiOperation(value = " 批量删除模型_判定标准信息")
    @SystemControllerLog(description = "批量删除模型_判定标准信息")
    @RequestMapping(value = "/batchDeleteAdsModelJudgeStandard",method = RequestMethod.POST)
    public Object batchDeleteAdsModelJudgeStandard(AdsModelJudgeStandard adsModelJudgeStandard,String token){
        try{
            Assert.isNotBlank(token,"token");
            CurrentUser u= WebUtil.getCurrentUser(token);
            adsModelJudgeStandard.setUpdateBy(u.getId());
            int flag = adsModelJudgeStandardService.batchDelete(adsModelJudgeStandard);
            if(flag > 0){
                return setSuccessModelMap(new ModelMap());
            }else{
                return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
            }
        }catch (Exception e){
            logger.error("AdsModelJudgeStandardController.batchDeleteAdsModelJudgeStandard:批量删除模型_判定标准信息异常",e); //日志服务器抓取数据
            return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "上传附件并保存")
    @SystemControllerLog(description = "上传附件并保存")
    @RequestMapping(value = "/saveFile", method = RequestMethod.POST)
    public Object saveFile(AdsModelJudgeStandard adsModelJudgeStandard,HttpServletRequest request, HttpServletResponse response,String token) {
        //token
        try{
            Assert.isNotBlank(token,"token");
            CurrentUser u= WebUtil.getCurrentUser(token);
            adsModelJudgeStandard.setUpdateBy(u.getId());
            String address = this.uploadFile(request);
            String file_path = "http://" + address;
            adsModelJudgeStandard.setFilePath(file_path);
            adsModelJudgeStandardService.update(adsModelJudgeStandard);
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("filePath",file_path);
            map.put("httpCode", ApiMsgConstants.SUCCESS_CODE);
            map.put("msg",ApiMsgConstants.SUCCESS_MSG);
            return map;
        }catch (Exception e){
            logger.error("AdsModelJudgeStandardController.saveFile:上传附件并保存异常",e); //日志服务器抓取数据
            return setModelMap(new ModelMap(), HttpCode.INTERNAL_SERVER_ERROR);
        }
    }

}

