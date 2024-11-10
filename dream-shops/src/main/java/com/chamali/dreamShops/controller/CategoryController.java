package com.chamali.dreamShops.controller;

import com.chamali.dreamShops.exceptions.AlreadyExistsException;
import com.chamali.dreamShops.exceptions.ResourceNotFoundException;
import com.chamali.dreamShops.model.Category;
import com.chamali.dreamShops.response.ApiResponse;
import com.chamali.dreamShops.service.category.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/categories")
public class CategoryController {
    private final ICategoryService categoryService;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllCategories(){
        try {
            List<Category> categories= categoryService.getAllCategories();
            return ResponseEntity.ok(new ApiResponse("Found!", categories));
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse("Error: ",INTERNAL_SERVER_ERROR));
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addCategory(@RequestBody Category name){
        try {
            Category theCategory = categoryService.addCategory(name);
            return ResponseEntity.ok(new ApiResponse("Success",theCategory));
        } catch (AlreadyExistsException e) {
            return ResponseEntity.status(CONFLICT).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @GetMapping("/category/{id}/category")
    public ResponseEntity<ApiResponse> getCategoryById(@PathVariable Long id){
        try {
            Category theCategory = categoryService.getCategoryById(id);
            return ResponseEntity.ok(new ApiResponse("Found",theCategory));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND)
                    .body(new ApiResponse(e.getMessage(),null));
        }
    }

    @GetMapping("/{name}/category")
    public ResponseEntity<ApiResponse> getCategoryByName(@PathVariable String name){
        try {
            Category theCategory = categoryService.getCategoryByName(name);
            return ResponseEntity.ok(new ApiResponse("Found",theCategory));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND)
                    .body(new ApiResponse(e.getMessage(),null));
        }
    }
































}
