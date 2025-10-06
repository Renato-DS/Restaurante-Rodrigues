@echo off
cd /d "%~dp0"

if not exist "target" (
    echo Certifique-se de que o projeto foi compilado antes de executar.
    pause
    exit /b
)

cd target
echo Iniciando Restaurante Rodrigues...
java -jar "Restauranterodrigues-1.0.jar"
pause
