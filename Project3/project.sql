-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 20, 2022 at 09:21 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `db_input1`
--

CREATE TABLE IF NOT EXISTS `db_input1` (
  `Nm_Obat` varchar(20) NOT NULL,
  `Jml_Diterima` int(35) NOT NULL,
  `Nm_Pabrik` varchar(15) NOT NULL,
  `Sumber_Dana` varchar(35) NOT NULL,
  `Kelompok_Obat` varchar(25) NOT NULL,
  `No_Batch` varchar(25) NOT NULL,
  `Tgl_Kadarluarsa` date NOT NULL,
  `Tgl_Terima` varchar(15) NOT NULL,
  PRIMARY KEY (`Nm_Obat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `db_input1`
--

INSERT INTO `db_input1` (`Nm_Obat`, `Jml_Diterima`, `Nm_Pabrik`, `Sumber_Dana`, `Kelompok_Obat`, `No_Batch`, `Tgl_Kadarluarsa`, `Tgl_Terima`) VALUES
('1231', 123123, '123123', 'APBN', 'PKD', '123123', '2022-02-22', '2024-02-22'),
('3', 4, 's', 'APBN', 'PKD', 's', '2022-02-23', '2021-02-23'),
('aku', 2, 'suka-suka', 'APBD', 'PROGRAM', '1', '2022-02-25', '2023-02-25'),
('d', 2, 'df', 'APBN', 'PKD', '3', '2022-02-15', '2024-02-15'),
('komik', 15, 'kimia farma', 'APBD', 'PKD', '01', '2022-02-19', '2023-02-19'),
('ratanidin', 100, 'apotik', 'APBD', 'PROGRAM', '02', '2022-02-08', '2024-02-08');

-- --------------------------------------------------------

--
-- Table structure for table `db_input2`
--

CREATE TABLE IF NOT EXISTS `db_input2` (
  `Nama_Instansi` varchar(11) NOT NULL,
  `Nm_obat` varchar(11) NOT NULL,
  `Jml_Didistribusi` int(11) NOT NULL,
  `Sumber_Dana` varchar(11) NOT NULL,
  `Kelompok_Obat` varchar(11) NOT NULL,
  `No_Batch` varchar(11) NOT NULL,
  `Tgl_Kadarluarsa` varchar(15) NOT NULL,
  PRIMARY KEY (`Nama_Instansi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `db_input2`
--

INSERT INTO `db_input2` (`Nama_Instansi`, `Nm_obat`, `Jml_Didistribusi`, `Sumber_Dana`, `Kelompok_Obat`, `No_Batch`, `Tgl_Kadarluarsa`) VALUES
('12312', '123123', 123123, 'APBN', 'PKD', '123123', '2024-02-20'),
('e', '4', 3, 'APBD', 'PKD', '3', '2023-10-07');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `no` int(8) NOT NULL,
  `Nm_Obat` varchar(20) NOT NULL,
  `Nama_Instansi` varchar(11) NOT NULL,
  `tgl` date NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`no`,`Nm_Obat`,`Nama_Instansi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no`, `Nm_Obat`, `Nama_Instansi`, `tgl`, `stock`) VALUES
(1, '1231', '12312', '2022-02-20', 0),
(2, 'd', 'e', '2022-02-20', 13),
(3, 'ratanidin', 'e', '2022-02-20', 45);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
