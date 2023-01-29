/*
 Navicat Premium Data Transfer

 Source Server         : Mybatis
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : powernode

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 29/01/2023 14:44:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_car
-- ----------------------------
DROP TABLE IF EXISTS `t_car`;
CREATE TABLE `t_car`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `car_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `brand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `guide_price` decimal(10, 2) NULL DEFAULT NULL,
  `produce_time` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `car_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_car
-- ----------------------------
INSERT INTO `t_car` VALUES (1, '1001', '宝马Li', 10.00, '2020-10-11', '燃油车');
INSERT INTO `t_car` VALUES (2, '1002', '奔驰E300L', 55.00, '2020-11-11', '新能源');
INSERT INTO `t_car` VALUES (3, '1003', 'iii', 30.80, '2020-11-11', '燃油车');
INSERT INTO `t_car` VALUES (4, '1004', 'iii', 30.80, '2020-11-11', 'jjche');
INSERT INTO `t_car` VALUES (5, '1004', 'yyy', 31.10, '2023-01-28', 'jjche');
INSERT INTO `t_car` VALUES (6, '1004', 'ccc', 32.10, '2023-01-28', 'jjche');
INSERT INTO `t_car` VALUES (7, '1004', 'ccc', 32.10, '2023-01-28', 'jjche');
INSERT INTO `t_car` VALUES (8, '1004', 'ccc', 32.10, '2023-01-28', 'jjche');
INSERT INTO `t_car` VALUES (10, '1004', 'ccc', 32.10, '2023-01-28', 'jjche');
INSERT INTO `t_car` VALUES (11, '1005', 'lll', 32.10, '2023-01-28', '雪佛兰凯美瑞');
INSERT INTO `t_car` VALUES (12, '1005', 'lll', 32.10, '2023-01-28', '雪佛兰凯美瑞');
INSERT INTO `t_car` VALUES (13, '111', '比亚迪海豹', 10.00, '2020-11-11', '新能源');
INSERT INTO `t_car` VALUES (14, '222', '比亚迪秦', 21.20, '2022-11-11', '新能源');
INSERT INTO `t_car` VALUES (15, '123', '比亚迪唐', 31.10, '2023-01-01', '新能源');
INSERT INTO `t_car` VALUES (17, '123', '比亚迪唐', 31.10, '2023-01-01', '新能源');
INSERT INTO `t_car` VALUES (23, '123', '比亚迪唐', 31.10, '2023-01-01', '新能源');

SET FOREIGN_KEY_CHECKS = 1;
