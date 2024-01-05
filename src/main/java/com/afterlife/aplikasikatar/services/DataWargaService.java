package com.afterlife.aplikasikatar.services;

import com.afterlife.aplikasikatar.repositories.DataWargaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataWargaService {

    @Autowired
    private DataWargaRepo repo;
}
