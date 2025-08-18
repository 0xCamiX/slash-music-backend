#!/bin/bash

# Script para limpiar la base de datos en desarrollo
echo "🧹 Limpiando base de datos..."

# Detener contenedores
docker-compose down -v

# Eliminar volúmenes
docker volume prune -f

# Reiniciar contenedores
docker-compose up -d

echo "✅ Base de datos limpiada y reiniciada"
echo "🚀 Ahora puedes ejecutar la aplicación con Flyway"
