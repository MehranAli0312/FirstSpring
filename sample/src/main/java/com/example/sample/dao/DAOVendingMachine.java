package com.example.sample.dao;

import com.example.sample.model.ItemVendingMachine;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

@Repository
public class DAOVendingMachine {
    public static final String FILE = "D:\\FirstSpring/javaRead.txt";
    public static final String DELIMITER = "::";
    private Map<Long, ItemVendingMachine> vendingMachineMap = new HashMap<>();

    public List<ItemVendingMachine> getAllItems() throws Exception {
        loadVendingMachineFile();
        return vendingMachineMap.values().stream().collect(Collectors.toList());
    }

    public void loadVendingMachineFile() throws Exception {
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(FILE)));
        } catch (FileNotFoundException e) {
            throw new Exception("*** Could not data*** ", e);
        }

        int counter = 0;

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {
            if (counter > 0) {
                currentLine = scanner.nextLine();
                currentTokens = currentLine.split(DELIMITER);
                ItemVendingMachine currentItem = new ItemVendingMachine();
                currentItem.setId(Long.parseLong(currentTokens[0]));
                currentItem.setName(currentTokens[1]);
                currentItem.setPrice(Double.parseDouble(currentTokens[2]));
                currentItem.setQty(Integer.parseInt(currentTokens[3]));
                vendingMachineMap.put(currentItem.getId(), currentItem);
            }
            counter++;
        }

        scanner.close();
    }


}
