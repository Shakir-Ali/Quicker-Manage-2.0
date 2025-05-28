export interface User {
  id: number;
  username: string;
  role: 'ADMIN' | 'STAFF';
}

export interface Product {
  id: number;
  name: string;
  price: number;
  quantity: number;
  expiryDate: string;
  category: string;
}

export interface Bill {
  id: number;
  invoiceNumber: string;
  items: BillItem[];
  total: number;
  createdAt: string;
  customerId?: number;
}

export interface BillItem {
  productId: number;
  quantity: number;
  price: number;
  subtotal: number;
}

export interface SalesReport {
  period: string;
  totalSales: number;
  itemsSold: number;
  topProducts: {
    productId: number;
    name: string;
    quantity: number;
    revenue: number;
  }[];
}