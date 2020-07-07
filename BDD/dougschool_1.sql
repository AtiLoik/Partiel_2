-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 06 juil. 2020 à 14:03
-- Version du serveur :  10.4.6-MariaDB
-- Version de PHP :  7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `dougschool`
--
CREATE DATABASE IF NOT EXISTS `dougschool` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE `dougschool`;

-- --------------------------------------------------------

--
-- Structure de la table `ds_classes`
--

CREATE TABLE `ds_classes` (
  `classes_name` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `classes_hours` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ds_school`
--

CREATE TABLE `ds_school` (
  `school_name` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `school_contact` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `school_address` varchar(1000) COLLATE utf8mb4_bin NOT NULL,
  `school_phone` varchar(15) COLLATE utf8mb4_bin NOT NULL,
  `school_manager_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ds_users`
--

CREATE TABLE `ds_users` (
  `user_id` int(11) NOT NULL,
  `user_lastname` varchar(200) COLLATE utf8mb4_bin NOT NULL,
  `user_firstname` varchar(200) COLLATE utf8mb4_bin NOT NULL,
  `user_email` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `user_address` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `user_phone` varchar(12) COLLATE utf8mb4_bin NOT NULL,
  `user_birthdate` date DEFAULT NULL,
  `user_type` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ds_users_loggable`
--

CREATE TABLE `ds_users_loggable` (
  `user_id` int(11) NOT NULL,
  `login` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(500) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ds_users_students`
--

CREATE TABLE `ds_users_students` (
  `user_id` int(11) NOT NULL,
  `current_classes_name` varchar(500) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ds_users_teachers`
--

CREATE TABLE `ds_users_teachers` (
  `user_id` int(11) NOT NULL,
  `classes_name` varchar(500) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `ds_classes`
--
ALTER TABLE `ds_classes`
  ADD PRIMARY KEY (`classes_name`);

--
-- Index pour la table `ds_school`
--
ALTER TABLE `ds_school`
  ADD PRIMARY KEY (`school_name`),
  ADD KEY `directeur` (`school_manager_id`);

--
-- Index pour la table `ds_users`
--
ALTER TABLE `ds_users`
  ADD PRIMARY KEY (`user_id`);

--
-- Index pour la table `ds_users_loggable`
--
ALTER TABLE `ds_users_loggable`
  ADD PRIMARY KEY (`user_id`);

--
-- Index pour la table `ds_users_students`
--
ALTER TABLE `ds_users_students`
  ADD KEY `id user` (`user_id`),
  ADD KEY `classes name` (`current_classes_name`);

--
-- Index pour la table `ds_users_teachers`
--
ALTER TABLE `ds_users_teachers`
  ADD KEY `teacher` (`user_id`),
  ADD KEY `classes` (`classes_name`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `ds_users`
--
ALTER TABLE `ds_users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `ds_school`
--
ALTER TABLE `ds_school`
  ADD CONSTRAINT `directeur` FOREIGN KEY (`school_manager_id`) REFERENCES `ds_users` (`user_id`);

--
-- Contraintes pour la table `ds_users_loggable`
--
ALTER TABLE `ds_users_loggable`
  ADD CONSTRAINT `login` FOREIGN KEY (`user_id`) REFERENCES `ds_users` (`user_id`);

--
-- Contraintes pour la table `ds_users_students`
--
ALTER TABLE `ds_users_students`
  ADD CONSTRAINT `classes name` FOREIGN KEY (`current_classes_name`) REFERENCES `ds_classes` (`classes_name`),
  ADD CONSTRAINT `id user` FOREIGN KEY (`user_id`) REFERENCES `ds_users` (`user_id`);

--
-- Contraintes pour la table `ds_users_teachers`
--
ALTER TABLE `ds_users_teachers`
  ADD CONSTRAINT `classes` FOREIGN KEY (`classes_name`) REFERENCES `ds_classes` (`classes_name`),
  ADD CONSTRAINT `teacher` FOREIGN KEY (`user_id`) REFERENCES `ds_users` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
