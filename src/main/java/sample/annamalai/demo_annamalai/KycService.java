package sample.annamalai.demo_annamalai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KycService {
    @Autowired
    KycRepository kycRepository;

    // insertion/update
    public KYC changes(KYC kyc){
        return kycRepository.save(kyc);
    }

    public List<KYC> fetch(){
        return kycRepository.findAll();
    }

    public Optional<KYC> fetchOne(long number){
        return kycRepository.findById(number);
    }

    public List<KYC> fetchingBalance(double balance){
        return kycRepository.findAllByAccBalance(balance);
    }

    public void deleting(long number){
        kycRepository.deleteById(number);
    }
}
