package com.steinkeit.progressivehousehold.infrastructure.web.controller.finance;

import com.steinkeit.progressivehousehold.domain.model.finance.*;
import com.steinkeit.progressivehousehold.domain.service.FinanceService;
import com.steinkeit.progressivehousehold.infrastructure.filehandler.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping(value = "/finance/")
public class FinanceController {

    private final FinanceService financeService;

    @Autowired
    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/")
    @ResponseBody
    public String financeIndex() {
        return "<h1>finance</h1>";
    }

    @PostMapping("/add")
    public String createReceipt(
            String title,
            Double amount,
            LocalDate localDate,
            @RequestParam("image") MultipartFile multipartFile
    ) throws IOException {

        Receipt receipt = ReceiptFactory.create(title, amount, localDate);

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());

        String uploadDir = "receipt-photos/" + receipt.getId();

        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        return "redirect:/finance/";
    }

    @GetMapping("/add")
    public String showFinanceAdd() {
        return "finance-create";
    }
}
