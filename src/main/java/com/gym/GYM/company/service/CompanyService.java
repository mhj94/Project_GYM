package com.gym.GYM.company.service;


import java.io.IOException;
import java.util.Map;

import com.gym.GYM.company.dto.MembershipDTO;
import com.gym.GYM.company.dto.PersonalTrainingDTO;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.company.dto.CompanyDTO;

public interface CompanyService {
    ModelAndView companyRegist(CompanyDTO company, MembershipDTO membership, PersonalTrainingDTO personalTraining) throws IOException;

    ModelAndView companyList(int page, int limit);

    ModelAndView companyView(String companyCode);

    ModelAndView companyModifyForm(String companyCode);

    ModelAndView companyModify(CompanyDTO company) throws IOException;

    ModelAndView companyDelete(String companyCode);

}
