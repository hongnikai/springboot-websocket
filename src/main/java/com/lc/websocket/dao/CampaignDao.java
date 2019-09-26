package com.lc.websocket.dao;

import com.lc.websocket.bean.CampaignDTO;
import com.lc.websocket.bean.GoogleCampaignDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface CampaignDao {

    Boolean insertCampaign(CampaignDTO campaignDTO);

    Boolean deleteCampaign(Long campaignId);

    Boolean updateCampaign(CampaignDTO campaignDTO);

    List<CampaignDTO> getAllCampaign();
}
