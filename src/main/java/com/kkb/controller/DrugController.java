package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Drug;
import com.kkb.service.DrugService;
import com.kkb.vo.DrugVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@ResponseBody
@RequestMapping("medicine")
public class DrugController{

    @Resource
    private DrugService drugService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Drug> drugByPage(Integer pageNum,Integer pageSize,DrugVO vo) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        System.out.println(vo);
        if(pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if(pageSize==null || pageSize<=0){
            pageSize=4;
        }

        PageInfo<Drug> drugPageInfo = drugService.queryByPage(pageNum, pageSize,vo);
        System.out.println(drugPageInfo);
        return new ResultVO<>(drugPageInfo);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Drug> drugById(@PathVariable("id") Integer dr_id){
        Drug drug = drugService.drugById(dr_id);
        return new ResultVO<>(drug);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Drug> updateDrug(@PathVariable("id") Integer dr_id,Drug drug){
        drug.setDr_id(dr_id);
        int i = drugService.updateDrug(drug);
        if(i==1){
            return new ResultVO<Drug>();
        }
        return new ResultVO<>(500,"服务器内部异常，请稍后再试！");
    }
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Drug> addDrug(Drug drug){
        System.out.println(drug);
        int i = drugService.addDrug(drug);
        if(i==1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"服务器内部异常，请稍后再试！");
    }
    @RequestMapping(value = "{id}",method = RequestMethod.POST)
    public ResultVO<Drug> uploadLogo(@RequestParam("logo") MultipartFile myFile, HttpServletRequest request,
                                     @PathVariable("id") Integer dr_id){
        //文件上传到指定服务器位置
        String path=request.getServletContext().getRealPath("/img/uploadFile/");
        //获取原始文件的名称
        String originalFilename = myFile.getOriginalFilename();
        //定义文件的新名词：随机生成的名称+原有文件的后缀名
        String randomName= UUID.randomUUID().toString().replace("-","");
        int index=originalFilename.lastIndexOf(".");
        String hz=originalFilename.substring(index);
        String logoName=randomName+hz;
        int num=0;
        try {
            myFile.transferTo(new File(path+"/"+logoName));
            System.out.println("上传成功！"+path+"/"+logoName);
            //将图片的名称更新到数据库中
            Drug drug = new Drug();
            drug.setDr_id(dr_id);
            drug.setDr_url(logoName);
            num=drugService.updateDrug(drug);
            if(num==1){
                return new ResultVO<Drug>();
            }else{
                return new ResultVO<>(500,"服务器内部异常，请稍后再试！");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new ResultVO<>(500,"图片上传出现问题！"+e.getMessage());
        }
    }
}
