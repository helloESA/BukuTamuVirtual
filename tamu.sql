-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Jun 2020 pada 14.53
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datatamu`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tamu`
--

CREATE TABLE `tamu` (
  `id_tamu` int(11) NOT NULL,
  `nama_tamu` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `no_telepon` varchar(255) NOT NULL,
  `tujuan_tamu` varchar(255) NOT NULL,
  `tanggal_masuk` varchar(255) NOT NULL,
  `waktu_masuk` varchar(255) NOT NULL,
  `waktu_keluar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tamu`
--

INSERT INTO `tamu` (`id_tamu`, `nama_tamu`, `alamat`, `no_telepon`, `tujuan_tamu`, `tanggal_masuk`, `waktu_masuk`, `waktu_keluar`) VALUES
(1, 'Mohamad Esa Remaya', 'Melong', '0896722441113', 'Bertemu pak Edo', 'Rabu, 24 Juni 2020', '17:49:07', '18:04:30'),
(2, 'Andi', 'Jamanis', '0872435446574', 'Menitipkan Surat Lamaran', 'Rabu, 24 Juni 2020', '18:05:13', '18:07:31'),
(4, 'Doni', 'Bandung', '087242424252', 'Menanyakan kelanjutan magang', 'Rabu, 24 Juni 2020', '18:19:28', NULL),
(5, 'Boni', 'Katapang', '089245364348', 'menanyakan kelanjutan magang', 'Rabu, 24 Juni 2020', '18:20:29', NULL);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tamu`
--
ALTER TABLE `tamu`
  ADD PRIMARY KEY (`id_tamu`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tamu`
--
ALTER TABLE `tamu`
  MODIFY `id_tamu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
