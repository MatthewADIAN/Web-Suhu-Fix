/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websuhu.Frameworksuhu.repositories;

import com.websuhu.Frameworksuhu.entities.DataTemperatur;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Matthew
 */
public interface DataTemperaturRepository extends JpaRepository<DataTemperatur, Integer> {
    
}
