package vn.myshop.laptopshop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import vn.myshop.laptopshop.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>,
        JpaSpecificationExecutor<Product> {
    Page<Product> findAll(Pageable page);//hiển thị danh sách dlieu product trong 1 page theo cách lấy pageble( là lấy bnhieu ptu của trang nào)
    //lấy danh sách dữ liệu từ cơ sở dữ liệu theo cách phân trang pageable
    //1. Page<Customer> page, chua:
    //Danh sách dữ liệu: Các bản ghi Customer trên trang hiện tại.
    //Thông tin phân trang: Số trang hiện tại, tổng số trang, tổng số phần tử, kích thước trang, v.v.

    //2. findAll(pageable): lấy dlieu theo cách phân trang này
    //Trang nào cần lấy (pageNumber).
    //Kích thước của mỗi trang (pageSize).
    //Tiêu chí sắp xếp (nếu được định nghĩa trong Pageable).

    Page<Product> findAll(Specification<Product> spec, Pageable page);
}
