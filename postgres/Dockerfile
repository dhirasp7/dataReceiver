FROM postgres:10-alpine
ENV POSTGRES_DB my_database
WORKDIR /docker-entrypoint-initdb.d
ADD schema.sql .
EXPOSE 5432