package com.afterlife.systempendataanwarga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.afterlife.systempendataanwarga.services.DataWargaService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DataWargaController {

    @Autowired
    private DataWargaService dataWargaService;
    
}
