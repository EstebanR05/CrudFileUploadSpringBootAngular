package com.library.ApiRestLibrary.Services;

import com.library.ApiRestLibrary.Entity.Inventary;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InventaryService {

    List<Inventary> getAllInventaries();

    Inventary getInventaryById(long id);

    UrlResource getFileByInventary(String name);

    Inventary createInventary(Inventary inventary);

    Inventary updateInventary(Inventary inventary, long id);

    Boolean deleteInventary(long id);
}
