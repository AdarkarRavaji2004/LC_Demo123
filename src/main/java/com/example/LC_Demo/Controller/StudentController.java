package com.example.LC_Demo.Controller;

import com.example.LC_Demo.Entity.Admission;
import com.example.LC_Demo.Repository.AdmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController
{
    @Autowired
    AdmissionRepo admissionRepo;

    @GetMapping("/admission/")
    public String home()
    {
        List<Admission> list=admissionRepo.findAll();
        return "AdmissionForm";
    }
    @PostMapping("/admission/save/")
    public String save(Admission admission)
    {
        admissionRepo.save(admission);
        return "redirect:/admission/";
    }
}
