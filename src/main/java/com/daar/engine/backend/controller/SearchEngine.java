package com.daar.engine.backend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/search")
@Tag(name = "Search Engine", description = "Moteur de recherche des livres")
public class SearchEngine {

    @Operation(
            summary = "Traiter une image pour l'extraction de texte OCR",
            description = "Upload une image et récupère le texte extrait au format XML.",
            tags = { "OCR Controller" }
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Texte extrait avec succès",
                    content = @Content(mediaType = "application/xml", schema = @Schema(type = "string"))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Requête invalide ou format de fichier incorrect",
                    content = @Content(mediaType = "application/xml", schema = @Schema(type = "string"))
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Erreur interne du serveur lors du traitement de l'image",
                    content = @Content(mediaType = "application/xml", schema = @Schema(type = "string"))
            )
    })
    @PostMapping(
            value = "/author"
    )
    public ResponseEntity<String> processSearch(

    ) {
        return null;
    }
}
