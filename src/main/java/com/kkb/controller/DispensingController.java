package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Behospital;
import com.kkb.pojo.Drug;
import com.kkb.pojo.Drugpeople;
import com.kkb.pojo.Patient;
import com.kkb.service.BeHospitalService;
import com.kkb.service.DispensingService;
import com.kkb.service.DrugService;
import com.kkb.vo.DandPVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("dispensing")
public class DispensingController {

    @Resource
    private DispensingService dispensingService;
    @Resource
    private DrugService drugService;
    @Resource
    private BeHospitalService beHospitalService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<Behospital> queryByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("peopleid") Integer peopleid) {
        if (pageSize == null || pageSize <= 0) {
            pageSize = 10;
        }
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        PageInfo<Behospital> behospitalPageInfo = dispensingService.QueryByPage(pageNum, pageSize, peopleid);

        return new ResultVO<>(behospitalPageInfo);
    }

    @RequestMapping(value = "{peopleid}", method = RequestMethod.GET)
    public ResultVO<Behospital> queryById(@PathVariable("peopleid") Integer peopleid) {
        Behospital behospital = beHospitalService.queryByBehId(peopleid);
        List<Drug> drugs = drugService.queryAll();
//        behospital.setDrugs(drugs);
        return new ResultVO<>(behospital);
    }

    @RequestMapping(value = "list/{id}", method = RequestMethod.GET)
    public ResultVO<DandPVO> queryByIdAndPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @PathVariable("id") Integer id) {
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        PageInfo<DandPVO> dandPVOPageInfo = dispensingService.QueryByPageAndId(pageNum, pageSize, id);
        return new ResultVO<>(dandPVOPageInfo);
    }

    //发药
    @RequestMapping(value = "give/{id}", method = RequestMethod.PUT)
    public ResultVO<Drugpeople> giveDrug(@PathVariable("id") Integer pId, @RequestParam("dr_id") Integer dr_id, @RequestParam("number") Integer number) {
        int i = dispensingService.giveDrug(pId, dr_id, number);
        if (i == 1) {
            return new ResultVO<>(200, "成功");
        } else {
            return new ResultVO<>(500, "失败");
        }
    }

    @RequestMapping(value = "grant/{id}", method = RequestMethod.PUT)
    public ResultVO<Drugpeople> grant(@PathVariable("id") Integer pId, @RequestParam("dr_id") Integer dr_id, @RequestParam("type") Integer type) {
        int i = dispensingService.grant(pId, dr_id, type);
        if (i == 1) {
            return new ResultVO<>(200, "成功");
        } else {
            return new ResultVO<>(500, "失败");
        }
    }

    @RequestMapping(value = "drug", method = RequestMethod.GET)
    public ResultVO<Drug> queryAll() {
        List<Drug> drugs = drugService.queryAll();
        return new ResultVO<>(drugs);
    }

    @RequestMapping(value = "giveDrugs/{id}", method = RequestMethod.PUT)
    public ResultVO<Drugpeople> giveDrugs(@RequestParam("peopleids") List<Integer> peopleids, @PathVariable("id") Integer dr_id,
                                       @RequestParam("number") Integer number) {
        int i = dispensingService.giveDrugs(peopleids, dr_id, number);
        if (i > 1) {
            return new ResultVO<>(200, "成功");
        } else {
            return new ResultVO<>(500, "失败");
        }
    }

    @RequestMapping(value = "giveDrugs/{id}", method = RequestMethod.DELETE)
    public ResultVO<Drugpeople> delAll(@RequestParam("pids") List<Integer> ids) {
        int i = dispensingService.deletePatient(ids);
        if (i > 1) {
            return new ResultVO<>(200, "成功");
        } else {
            return new ResultVO<>(500, "失败");
        }
    }
}
