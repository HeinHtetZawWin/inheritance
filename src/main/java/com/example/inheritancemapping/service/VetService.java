package com.example.inheritancemapping.service;

import com.example.inheritancemapping.dao.ExHouseVetDao;
import com.example.inheritancemapping.dao.InHouseVetDao;
import com.example.inheritancemapping.ds.ExHouseVet;
import com.example.inheritancemapping.ds.InHouseVet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VetService {
    @Autowired
    private InHouseVetDao inHouseVetDao;
    @Autowired
    private ExHouseVetDao exHouseVetDao;

    @Transactional
    public void createDb() {
        InHouseVet inHouseVet1 = new InHouseVet("John Doe", "MSC", 3000);
        InHouseVet inHouseVet2 = new InHouseVet("John William", "MSC", 4000);

        ExHouseVet exHouseVet1 = new ExHouseVet("Thomas Hardy", "MSC", "Thailand", 5000);
        ExHouseVet exHouseVet2 = new ExHouseVet("Ishiguro", "MSC", "Japan", 6000);

        inHouseVetDao.save(inHouseVet1);
        inHouseVetDao.save(inHouseVet2);
        exHouseVetDao.save(exHouseVet1);
        exHouseVetDao.save(exHouseVet2);

    }
}
