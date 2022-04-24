
package com.thesis.pcbuilder;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thesis.pcbuilder.domain.dao.*;
import com.thesis.pcbuilder.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

@Component
public class DataBaseRunner implements CommandLineRunner {

    private final MemoryDAO memoryDAO;

    private final MonitorDAO monitorDAO;

    private final MotherboardDAO motherboardDAO;

    private final PcCaseDAO pcCaseDAO;

    private final PowerSupplyDAO powerSupplyDAO;
    private final ProcessorDAO processorDAO;

    private final ProcessorCoolerDAO processorCoolerDAO;

    private final StorageDAO storageDAO;
    private final VideoCardDAO videoCardDAO;

    private final Gson gson;


    public DataBaseRunner(MemoryDAO memoryDAO, MonitorDAO monitorDAO, MotherboardDAO motherboardDAO, PcCaseDAO pcCaseDAO, PowerSupplyDAO powerSupplyDAO, ProcessorDAO processorDAO, ProcessorCoolerDAO processorCoolerDAO, StorageDAO storageDAO, VideoCardDAO videoCardDAO, Gson gson) {
        this.memoryDAO = memoryDAO;
        this.monitorDAO = monitorDAO;
        this.motherboardDAO = motherboardDAO;
        this.pcCaseDAO = pcCaseDAO;
        this.powerSupplyDAO = powerSupplyDAO;
        this.processorDAO = processorDAO;
        this.processorCoolerDAO = processorCoolerDAO;
        this.storageDAO = storageDAO;
        this.videoCardDAO = videoCardDAO;
        this.gson = gson;
    }

    @Override
    public void run(String... args) throws URISyntaxException {
        fillDummyData("memories", new TypeToken<List<Memory>>() {}.getType(), memoryDAO::saveAll);
       fillDummyData("monitors", new TypeToken<List<Monitor>>() {}.getType(), monitorDAO::saveAll);
        fillDummyData("motherboards", new TypeToken<List<Motherboard>>() {}.getType(), motherboardDAO::saveAll);
        fillDummyData("pccases", new TypeToken<List<PcCase>>() {}.getType(), pcCaseDAO::saveAll);
        fillDummyData("powersupplies", new TypeToken<List<PowerSupply>>() {}.getType(), powerSupplyDAO::saveAll);
        fillDummyData("processors", new TypeToken<List<Processor>>() {}.getType(), processorDAO::saveAll);
        fillDummyData("processorcoolers", new TypeToken<List<ProcessorCooler>>() {}.getType(), processorCoolerDAO::saveAll);
        fillDummyData("storage", new TypeToken<List<Storage>>() {}.getType(), storageDAO::saveAll);
        fillDummyData("videocards", new TypeToken<List<VideoCard>>() {}.getType(), videoCardDAO::saveAll);
    }


    public <T> void fillDummyData(String fileName,Type listType, Consumer<List<T>> function) throws URISyntaxException {
        Path path = Paths.get(Objects.requireNonNull(this.getClass().getClassLoader().getResource("dummydata/" + fileName + ".json")).toURI());
        try (Reader reader = Files.newBufferedReader(path)) {
            function.accept(gson.fromJson(reader, listType));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

