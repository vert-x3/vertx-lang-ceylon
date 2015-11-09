import ceylon.json { JsonObject=Object }

shared interface BaseDataObject {
  shared formal JsonObject toJson();
}