package com.lc.websocket.service.Impl;

import com.lc.websocket.bean.CampaignDTO;
import com.lc.websocket.bean.GoogleCampaignDTO;
import com.lc.websocket.dao.CampaignDao;
import com.lc.websocket.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "googleCampaignService")
public class GoogleCampaignServiceImpl implements CampaignService {

    @Autowired
    CampaignDao campaignDao;

    @Override
    public Boolean insertCampaign(CampaignDTO campaignDTO) {
        boolean flag = false;
        try{
            flag = campaignDao.insertCampaign(campaignDTO);
        }catch (Exception e){
            e.printStackTrace();
            return flag;
        }
        return flag;
    }

    @Override
    public Boolean deleteCampaign(Long campaignId) {
        boolean flag = false;
        try{
            flag = campaignDao.deleteCampaign(campaignId);
        }catch (Exception e){
            e.printStackTrace();
            return flag;
        }
        return flag;
    }

    @Override
    public Boolean updateCampaign(CampaignDTO campaignDTO) {
        boolean flag = false;
        try{
            flag = campaignDao.updateCampaign(campaignDTO);
        }catch (Exception e){
            e.printStackTrace();
            return flag;
        }
        return flag;
    }

    @Override
    public List<CampaignDTO> getAllCampaign() {
        return campaignDao.getAllCampaign();
    }


}
