package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetReqres {

        public int page;
        public int per_page;
        public int total;
        public int total_pages;
        public ArrayList<Datum> data;
        public Support support;


}
