-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Jan 2023 pada 16.14
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ppdb`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `panitia`
--

CREATE TABLE `panitia` (
  `no_panitia` varchar(40) NOT NULL,
  `nama_panitia` varchar(40) NOT NULL,
  `nip_panitia` varchar(40) NOT NULL,
  `notelp` varchar(40) NOT NULL,
  `alamat` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `panitia`
--

INSERT INTO `panitia` (`no_panitia`, `nama_panitia`, `nip_panitia`, `notelp`, `alamat`) VALUES
('001', 'fds', '324', '44332', 'dgdsf'),
('002', 'ucok', '980789', '76674435', 'gfd');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(10) NOT NULL,
  `kelompok` varchar(50) NOT NULL,
  `biaya` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `kelompok`, `biaya`) VALUES
('002', 'Kelompok 1', '2.00.000'),
('003', 'Kelompok 3', '1.000.000'),
('004', 'Kelompok 2', '1.500.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peserta`
--

CREATE TABLE `peserta` (
  `no_pendaftaran` varchar(10) NOT NULL,
  `nama_peserta` varchar(40) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `nisn` varchar(20) NOT NULL,
  `ttl` varchar(50) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peserta`
--

INSERT INTO `peserta` (`no_pendaftaran`, `nama_peserta`, `jk`, `nisn`, `ttl`, `agama`, `alamat`) VALUES
('002', 'Deden', 'Laki-laki', '1111', 'Banjarmasin, 01 Januari 2003', 'Islam', 'Banjarmasin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
