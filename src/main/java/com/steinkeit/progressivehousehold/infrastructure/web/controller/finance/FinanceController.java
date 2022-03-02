package com.steinkeit.progressivehousehold.infrastructure.web.controller.finance;

import com.steinkeit.progressivehousehold.domain.model.finance.*;
import com.steinkeit.progressivehousehold.infrastructure.filehandler.FileUploadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping(value = "/finance", method = {RequestMethod.GET, RequestMethod.POST})
public class FinanceController {

    @GetMapping("/")
    @ResponseBody
    public String financeIndex() {
        return "<h1>finance</h1>";
    }

    @PostMapping("/finance/add")
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

    @GetMapping("/finance/add")
    public String showFinanceAdd() {
        return "finance-create";
    }
}
