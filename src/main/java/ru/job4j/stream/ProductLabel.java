package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        List<String> rls = new ArrayList<>();
        products.stream()
                .filter(product -> (product.getStandard() - product.getActual() <= 3))
                .filter(product -> (product.getStandard() - product.getActual() >= 0))
                .forEach(product -> rls.add(new Label(product.getName(), product.getPrice() / 2).toString()));
        return rls;
    }
}
