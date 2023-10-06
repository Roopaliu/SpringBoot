package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datum {
        public int id;
        public String email;
        public String first_name;
        public String last_name;
        public String avatar;
    }

