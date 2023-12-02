package com.afterlife.systempendataanwarga.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afterlife.systempendataanwarga.repositories.DataWargaRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DataWargaService {

    @Autowired
    private DataWargaRepo repo;
}
