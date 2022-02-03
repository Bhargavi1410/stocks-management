package com.stocks;

import com.stocks.entities.StockEntity;
import com.stocks.exceptions.StocksResponseEntityExceptionHandler;
import com.stocks.repositories.StocksRepository;
import org.apache.commons.collections.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class StocksApplication {

    @Autowired
    private StocksRepository stocksRepository;

    public static void main(String[] args) {
        SpringApplication.run(StocksApplication.class, args);
    }

    @Bean
    public CommandLineRunner demoData(StocksRepository stocksRepository) {
        return args -> {
            StockEntity stockEntity = new StockEntity();
            stockEntity.setStockId(1);
            stockEntity.setStockName("Stock1");
            stockEntity.setStockPrice(new BigDecimal(65));
            stockEntity.setStockLastUpdate(new Date());
            StockEntity stockEntity2 = new StockEntity();
            stockEntity2.setStockId(2);
            stockEntity2.setStockName("Stock2");
            stockEntity2.setStockPrice(new BigDecimal(85));
            stockEntity2.setStockLastUpdate(new Date());
            List<StockEntity> stockEntities = new ArrayList<StockEntity>();
            stockEntities.add(stockEntity);
            stockEntities.add(stockEntity2);
            stocksRepository.saveAll(stockEntities);
        };
    }



}
