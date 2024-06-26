package sample.annamalai.demo_annamalai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kyc")
public class KycController {
    @Autowired
    KycService kycService;

    @GetMapping("/only/{account}")
    public Optional<KYC> getOne(@PathVariable("account") long account){
        return kycService.fetchOne(account);
    }

    @GetMapping("/access")
    public List<KYC> retrieve(){
        return kycService.fetch();
    }

    @PostMapping("/insert")// http://localhost:8085/kyc/insert
    public KYC saving(@RequestBody KYC kyc){
        return kycService.changes(kyc);
    }

    @GetMapping("/multi/{amount}")
    public List<KYC> getBalances(@PathVariable("amount") double amount){
        return kycService.fetchingBalance(amount);
    }

    @PutMapping("/updating")
    public KYC modify(@RequestBody KYC kyc){
        return kycService.changes(kyc);
    }

    @DeleteMapping("/remove/{number}")
    public String removing(@PathVariable("number") long number){
        kycService.deleting(number);
        return number+" has deleted";
    }
}
