@echo off
echo ==================================================
echo Ejecutando proyecto sin Visitor...
echo ==================================================

call compile.bat
if errorlevel 1 (
    echo [ERROR] La compilación falló. No se puede ejecutar.
    exit /b 1
)

java -cp bin sinvisitor.Main %*
echo ==================================================
