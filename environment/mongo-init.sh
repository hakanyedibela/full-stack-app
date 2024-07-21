mongo -- "$MONGO_INITDB_DATABASE" <<EOF
db.createUser(
  {
    user: "technical_user",
    pwd: "secret",
    roles: [ { role: "readWrite", db: "data" } ]
  }
)
EOF