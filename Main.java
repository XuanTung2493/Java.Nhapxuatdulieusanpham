import java.sql.Date;
import java.text.SimpleDateFormat;
import static java.lang.System.out;
import static java.lang.System.console;

void main()
{
out.print("\n NHẬP XUẤT DỮ LIỆU SẢN PHẨM");

// - Tên Sản Phẩm(chuỗi)
// - Năm Sản Xuất (số nguyên)
// - Đơn Giá $ (số thực)
// - Kích Thước (kí tự)
// - Còn Hàng (hay không)
// - Ngày Nhập (ngày tháng)

String Tên;
Integer Năm;
Float Giá;
Character KT;
Boolean Tồn;
Date Ngày;

out.print("\n Nhập tên sản phẩm: ");
Tên = console().readLine();

out.print("\n Nhập năm sản xuất: ");
Năm = Integer.parseInt(console().readLine());

out.print("\n Nhập đơn giá($): ");
Giá = Float.parseFloat(console().readLine());

out.print("\n Nhập kích thước hàng (S, M, L): ");
KT = console().readLine().charAt(0);

out.print("\n Còn tồn hàng hay không(true/fasle)?: ");
Tồn = Boolean.valueOf(console().readLine());

out.print("\n Nhập ngày nhập hàng (yyyy-MM-dd): ");
Ngày = Date.valueOf(console().readLine());

out.print("\n+--------------------------------------------------------------------------+");
out.print("\n| TÊN SẢN PHẨM | NĂM SẢN XUẤT | ĐƠN GIÁ | KÍCH THƯỚC | TỒN KHO | NGÀY NHẬP |");
out.print("\n+--------------------------------------------------------------------------+");
out.printf("\n| %12s | %12d | %7.2f | %10c | %7s | %9s |",
 Tên, Năm, Giá, KT, Tồn ? "Còn" : "Hết", new SimpleDateFormat("dd/MM/yyyy").format(Ngày));
out.print("\n+--------------------------------------------------------------------------+");

out.print("\n Đã xong việc xuất dữ liệu tĩnh ra bảng Terminal !");

}
// java --enable-preview Main.java

// NHẬP XUẤT DỮ LIỆU SẢN PHẨM
//  Nhập tên sản phẩm: Cocacola

//  Nhập năm sản xuất: 2024

//  Nhập đơn giá($): 1.2

//  Nhập kích thước hàng (S, M, L): M

//  Còn tồn hàng hay không(true/fasle)?: true

//  Nhập ngày nhập hàng (yyyy-MM-dd): 2024-01-26

// +--------------------------------------------------------------------------+
// | TÊN SẢN PHẨM | NĂM SẢN XUẤT | ĐƠN GIÁ | KÍCH THƯỚC | TỒN KHO | NGÀY NHẬP |
// +--------------------------------------------------------------------------+
// |     Cocacola |         2024 |    1.20 |          M |     Còn | 26/01/2024 |
// +--------------------------------------------------------------------------+
//  Đã xong việc xuất dữ liệu tĩnh ra bảng Terminal !