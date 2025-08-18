# 🚀 Flyway Database Migrations

Este proyecto ahora usa **Flyway** para manejar las migraciones de base de datos de manera profesional.

## 📁 Estructura de Migraciones

```
src/main/resources/db/migration/
├── V1__Create_initial_tables.sql    # Tablas iniciales
└── V2__Insert_sample_data.sql       # Datos de prueba
```

## 🔧 Configuración

### application-dev.properties
```properties
# JPA Configuration
spring.jpa.hibernate.ddl-auto=validate

# Flyway Configuration
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
spring.flyway.baseline-on-migrate=true
spring.flyway.validate-on-migrate=true
```

## 🚀 Cómo usar

### 1. **Primera ejecución:**
```bash
# Limpiar base de datos
./scripts/clean-db.sh

# Ejecutar aplicación
./gradlew bootRun
```

### 2. **Crear nueva migración:**
```bash
# Crear archivo: V3__Nombre_de_la_migracion.sql
# Ejecutar aplicación - Flyway aplicará automáticamente
```

### 3. **Verificar migraciones:**
```sql
-- En PostgreSQL
SELECT * FROM flyway_schema_history;
```

## 📝 Convenciones de Nomenclatura

- **V1__** - Versión 1
- **V2__** - Versión 2
- **__** - Separador doble guión bajo
- **Nombre descriptivo** - Con guiones bajos
- **.sql** - Extensión SQL

## 🧹 Limpieza de Base de Datos

```bash
# Script automático
./scripts/clean-db.sh

# Manual
docker-compose down -v
docker volume prune -f
docker-compose up -d
```

## ✅ Ventajas de Flyway

- ✅ **Versionado** de esquema de base de datos
- ✅ **Reproducible** en cualquier entorno
- ✅ **Validación** automática de migraciones
- ✅ **Rollback** controlado
- ✅ **Historial** completo de cambios

## 🚨 Comandos Útiles

```bash
# Ver logs de Flyway
tail -f logs/spring.log | grep flyway

# Verificar estado de migraciones
curl http://localhost:8090/actuator/flyway
```
