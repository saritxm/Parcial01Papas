-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-03-2024 a las 22:49:52
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `papa`
--

CREATE TABLE `papa` (
  `nombre` varchar(20) NOT NULL,
  `especie` varchar(12) DEFAULT NULL,
  `zonaP` varchar(30) DEFAULT NULL,
  `habitoC` varchar(70) DEFAULT NULL,
  `floracion` varchar(180) DEFAULT NULL,
  `bayas` varchar(60) DEFAULT NULL,
  `tuberculos` varchar(210) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `papa`
--

INSERT INTO `papa` (`nombre`, `especie`, `zonaP`, `habitoC`, `floracion`, `bayas`, `tuberculos`) VALUES
('ARBOLONA 1421', 'Andigena', 'NariÃ±o', '', '', '', ''),
('ARGENTINA 1286', 'Andigena', 'Boyaca', '', '', '', ''),
('BOLA DE SAL 1777', 'Andigena', 'NariÃ±o', '', '', '', ''),
('CARRIZO 0188', 'Andigena', 'Cundinamarca', '', '', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `papa`
--
ALTER TABLE `papa`
  ADD PRIMARY KEY (`nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
