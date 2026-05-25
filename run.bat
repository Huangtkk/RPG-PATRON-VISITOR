@echo off
echo ==================================================
echo Ejecutando proyecto Java...
echo ==================================================

if not exist bin\Main.class (
    echo [WARNING] No se encuentra bin\Main.class. Compilando primero...
    call compile.bat
    if errorlevel 1 (
        echo [ERROR] La compilación falló. No se puede ejecutar.
        exit /b 1
    )
)

java -cp bin Main %*
echo ==================================================
