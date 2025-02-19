/*
 * HR API
 * <a href='swaggerv2.json'>Download Swagger Json in OAS2 Format.</a>
 *
 * The version of the OpenAPI document: 2
 * Contact: hrapi@iris.co.uk
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The Owner of the entity
 */
@JsonAdapter(Ownership.Adapter.class)public enum Ownership {
  
  PERSONAL("Personal"),
  
  ORGANIZATION("Organization");

  private String value;

  Ownership(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ownership fromValue(String value) {
    for (Ownership b : Ownership.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Ownership> {
    @Override
    public void write(final JsonWriter jsonWriter, final Ownership enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Ownership read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Ownership.fromValue(value);
    }
  }
}

