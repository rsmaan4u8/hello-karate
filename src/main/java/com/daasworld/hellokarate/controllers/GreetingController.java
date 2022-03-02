package com.daasworld.hellokarate.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@RestController
public class GreetingController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    // $ curl localhost:8080/api/hello
    @GetMapping(value = "/api/hello", produces = "application/txt")
    public String greet(@RequestParam(required=false, defaultValue = "world") String name) {
        logger.info("greet() called");
        return String.format("Hello %s!", name);
    }

    private static final String EXISTING_CONFIGURATION = "existingConfiguration";
    private static final String BASE_IRIFOR_DATA = "baseIRIForData";
    private static final String BASE_IRIFOR_SCHEMA = "baseIRIForSchema";
    private static final String ID_SETUP = "idSetup";
    private static final String INVERSES = "inverses";
    private static final String INVERSE_PROPERTIES_LIST = "inversePropertiesList";
    private static final String DRY_RUN = "dryRun";
    private static final String ENABLE_DATA_RESET = "enableDataReset";
    private static final String DEFAULT_LANGUAGE_CODE = "defaultLanguageCode";

    @RequestMapping(path = "/api/multipart", method = RequestMethod.POST)
    public @ResponseBody
    String bootstrapPost(
            HttpServletRequest request,
            @RequestParam("files") MultipartFile[] files,
            @RequestParam(value = EXISTING_CONFIGURATION, required = false) String existingConfiguration,
            @RequestParam(value = BASE_IRIFOR_DATA, required = false) String egDataBaseIRI,
            @RequestParam(value = BASE_IRIFOR_SCHEMA, required = false) String egSchemaBaseIRI,
            @RequestParam(value = DEFAULT_LANGUAGE_CODE, required = false) String egDefaultLanguage,
            @RequestParam(value = ENABLE_DATA_RESET, required = false) String egEnableDataReset,
            @RequestParam(value = ID_SETUP, required = false) String idSetup,
            @RequestParam(value = "idSetupClassesList", required = false) String idSetupClassesList,
            @RequestParam(value = INVERSES, required = false) String inverses,
            @RequestParam(value = INVERSE_PROPERTIES_LIST, required = false) String inversePropertiesList,
            @RequestParam(value = DRY_RUN, required = false) String dryRun,
            @RequestHeader(CONTENT_TYPE) String contentType
    ) throws IOException {
        return "OK";
    }

}
