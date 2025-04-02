
# Laptop Shop - E-Commerce Web App

## Project Overview  
Laptop Shop là một ứng dụng web thương mại điện tử giúp người dùng mua sắm laptop trực tuyến. Ứng dụng hỗ trợ **quản lý sản phẩm, giỏ hàng, đặt hàng và phân quyền người dùng**.  
Dự án tập trung vào **phát triển backend với Spring Boot** và đảm bảo **bảo mật, hiệu suất cao**.  

## Tech Stack  
- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA, MySQL  
- **Frontend:** JSP, JSTL, HTML, CSS, JavaScript  
- **Tools:** Docker, Postman, Git, Maven  

## Features  

### 1️⃣ User Management  
- **Phân quyền người dùng (ROLE_USER / ROLE_ADMIN)**  
- **Đăng ký, đăng nhập, xác thực email**  
- **Quản lý session bằng Spring Session JDBC** (chỉ cho phép một phiên đăng nhập duy nhất trên mỗi tài khoản)  

### 2️⃣ Product Management  
- **CRUD sản phẩm** (tạo, sửa, xóa, tìm kiếm sản phẩm)  
- **Tìm kiếm nâng cao:** Lọc theo **giá, thương hiệu, tên sản phẩm**  
- **Hỗ trợ upload ảnh sản phẩm**  

### 3️⃣ Shopping Cart & Order Processing  
- **Người dùng có thể thêm/xóa/cập nhật sản phẩm trong giỏ hàng**  
- **Khi thêm sản phẩm vào giỏ hàng, nếu đã tồn tại thì chỉ cập nhật số lượng**  
- **Trang thanh toán và đặt hàng**  
- **Admin có thể xem và cập nhật trạng thái đơn hàng**  

### 4️⃣ Security & Session Management  
- **Spring Security với role-based access control (RBAC)**  
- **Chính sách session:** Một user chỉ có thể đăng nhập **một phiên duy nhất**  
- **Password hashing với BCrypt** để bảo vệ thông tin đăng nhập  

### 5️⃣ Deployment & Infrastructure  
- **Triển khai containerized với Docker**  
- **Sử dụng Spring Session JDBC để lưu session vào database**  

---

## Installation & Setup  
### Requirements  
- JDK 17+  
- MySQL 8+  
- Maven  
- Docker  

### Setup  
1. **Clone repository**  
   ```bash
   git clone https://github.com/phamlinh296/laptopshop.git
   cd laptopshop
   ```

2. **Cấu hình database** (MySQL)  
   - Tạo database `laptop_shop`
   - Cập nhật `application.properties` với thông tin database của bạn  

3. **Chạy ứng dụng**  
   ```bash
   mvn spring-boot:run
   ```

4. **Truy cập ứng dụng**  
   - Trang chủ: `http://localhost:8080/`  
   - Trang admin: `http://localhost:8080/admin`  

---

## Future Enhancements  
 **Thêm API quản lý đơn hàng**  
 **Tích hợp cổng thanh toán VNPAY**  
 **Cải thiện hiệu suất bằng Redis cache**  

---

## Contact  
📧 Email: phamylinh.kc@gmail.com  
📌 GitHub: [https://github.com/phamlinh296](https://github.com/phamlinh296)  
