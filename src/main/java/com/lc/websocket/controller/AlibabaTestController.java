package com.lc.websocket.controller;

import com.lc.websocket.bean.CampaignDTO;
import com.lc.websocket.bean.GoogleCampaignDTO;
import com.lc.websocket.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("all")
@RestController
@RequestMapping("/alibaba")
public class AlibabaTestController {

    @Autowired
    CampaignService campaignService;


    @RequestMapping("/googleTest")
    public Boolean googleTest(@RequestParam(value = "id",required = true)int id){
        CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setChannel("google");
        campaignDTO.setOperation("add");
        campaignDTO.setCampaignId(1112L);
        campaignDTO.setCampaignName("测试");
        campaignDTO.setCampaignStatus("测试状态");
        campaignDTO.setBudget("budget__test");
        campaignDTO.setAdSetId("ad_set_id");
        campaignDTO.setProductSet("");
        campaignDTO.setAudience("设置人群json");
        campaignDTO.setFeature("test ： json string");
      return campaignService.insertCampaign(campaignDTO);
    }

    @RequestMapping("/deleteCampaignTest")
    public Boolean deleteCampaignTest(@RequestParam(value = "campaignId",required = true)String campaignId){
        Long id = Long.parseLong(campaignId);
        return campaignService.deleteCampaign(id);
    }

    @RequestMapping("/updateCampaignTest")
    public Boolean updateCampaignTest(@RequestParam(value = "id",required = true)int id){
        CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(id);
        campaignDTO.setCampaignId(1112L);
        campaignDTO.setCampaignName("测试3");
        campaignDTO.setCampaignStatus("测试状态3");
        campaignDTO.setBudget("SEARCH");
        campaignDTO.setAdSetId("测试预算方法: STANDARD");
        campaignDTO.setProductSet("add");
        campaignDTO.setAudience("预算测试类型: MANUAL_CPC");
        campaignDTO.setFeature("test ： json string");
        return campaignService.updateCampaign(campaignDTO);
    }

    @RequestMapping("/getAllCampaignTest")
    public List<CampaignDTO> getAllCampaignTest(){
        return campaignService.getAllCampaign();
    }

}
