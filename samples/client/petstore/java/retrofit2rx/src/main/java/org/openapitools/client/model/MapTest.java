/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.StringBooleanMap;

/**
 * MapTest
 */

public class MapTest {
  public static final String SERIALIZED_NAME_MAP_MAP_OF_STRING = "map_map_of_string";
  @SerializedName(SERIALIZED_NAME_MAP_MAP_OF_STRING)
  private Map<String, Map<String, String>> mapMapOfString = null;

  /**
   * Gets or Sets inner
   */
  @JsonAdapter(InnerEnum.Adapter.class)
  public enum InnerEnum {
    UPPER("UPPER"),
    
    LOWER("lower");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InnerEnum fromValue(String text) {
      for (InnerEnum b : InnerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InnerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InnerEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MAP_OF_ENUM_STRING = "map_of_enum_string";
  @SerializedName(SERIALIZED_NAME_MAP_OF_ENUM_STRING)
  private Map<String, InnerEnum> mapOfEnumString = null;

  public static final String SERIALIZED_NAME_DIRECT_MAP = "direct_map";
  @SerializedName(SERIALIZED_NAME_DIRECT_MAP)
  private Map<String, Boolean> directMap = null;

  public static final String SERIALIZED_NAME_INDIRECT_MAP = "indirect_map";
  @SerializedName(SERIALIZED_NAME_INDIRECT_MAP)
  private StringBooleanMap indirectMap = null;

  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  public MapTest putMapMapOfStringItem(String key, Map<String, String> mapMapOfStringItem) {
    if (this.mapMapOfString == null) {
      this.mapMapOfString = new HashMap<String, Map<String, String>>();
    }
    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

   /**
   * Get mapMapOfString
   * @return mapMapOfString
  **/
  @ApiModelProperty(value = "")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }

  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  public MapTest mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  public MapTest putMapOfEnumStringItem(String key, InnerEnum mapOfEnumStringItem) {
    if (this.mapOfEnumString == null) {
      this.mapOfEnumString = new HashMap<String, InnerEnum>();
    }
    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

   /**
   * Get mapOfEnumString
   * @return mapOfEnumString
  **/
  @ApiModelProperty(value = "")
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }

  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }

  public MapTest directMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
    return this;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    if (this.directMap == null) {
      this.directMap = new HashMap<String, Boolean>();
    }
    this.directMap.put(key, directMapItem);
    return this;
  }

   /**
   * Get directMap
   * @return directMap
  **/
  @ApiModelProperty(value = "")
  public Map<String, Boolean> getDirectMap() {
    return directMap;
  }

  public void setDirectMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }

  public MapTest indirectMap(StringBooleanMap indirectMap) {
    this.indirectMap = indirectMap;
    return this;
  }

   /**
   * Get indirectMap
   * @return indirectMap
  **/
  @ApiModelProperty(value = "")
  public StringBooleanMap getIndirectMap() {
    return indirectMap;
  }

  public void setIndirectMap(StringBooleanMap indirectMap) {
    this.indirectMap = indirectMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(this.mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(this.mapOfEnumString, mapTest.mapOfEnumString) &&
        Objects.equals(this.directMap, mapTest.directMap) &&
        Objects.equals(this.indirectMap, mapTest.indirectMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapOfEnumString, directMap, indirectMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
    sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

