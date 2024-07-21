db=db.getSiblingDB("commerce");
db.dropDatabase();

db.createCollection("catalogs",{
    "validator": {
       "$jsonSchema": {
         "bsonType": "object",
         "title": "Commerce Catalog",
         "required": [
           "catalogName",
           "catalogLink"
         ]
      }
    }
  });
  
  db.catalogs.createIndex({"catalogName": 1}, {"unique": true});