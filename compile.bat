@echo off
setlocal enabledelayedexpansion

echo ==================================================
echo Compilando proyecto Java...
echo ==================================================

if not exist bin mkdir bin

REM Borrar sources.txt si ya existe
if exist sources.txt del sources.txt

REM Buscar todos los archivos .java recursivamente, reemplazar backslashes por forward slashes y guardarlos en sources.txt
for /f "delims=" %%i in ('dir /s /b src\*.java 2^>nul') do (
    set "filePath=%%i"
    set "filePath=!filePath:\=/!"
    echo "!filePath!" >> sources.txt
)

REM Verificar si se encontraron archivos Java
if not exist sources.txt (
    echo [ERROR] No se encontraron archivos Java en el directorio src.
    exit /b 1
)

REM Compilar usando el archivo temporal
javac -d bin @sources.txt
set EXIT_CODE=%ERRORLEVEL%

REM Borrar archivo temporal
del sources.txt

if %EXIT_CODE% equ 0 (
    echo [OK] Compilación exitosa. Los archivos se guardaron en 'bin/'.
) else (
    echo [ERROR] Ocurrió un error durante la compilación.
)

echo ==================================================
exit /b %EXIT_CODE%
