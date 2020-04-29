#!/bin/bash
docker run --name journal-app-postgres \
  --env POSTGRES_USER=journal-app --env POSTGRES_PASSWORD=postgress12345 -p 5432:5432 -d postgres:12.2