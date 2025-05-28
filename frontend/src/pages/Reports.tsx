import React from 'react';
import { BarChart3, TrendingUp, Package, DollarSign } from 'lucide-react';
import { SalesReport } from '../types';

function Reports() {
  return (
    <div className="space-y-6">
      <h1 className="text-2xl font-semibold text-gray-900">Reports & Analytics</h1>

      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
        <div className="bg-white p-6 rounded-lg shadow-md">
          <div className="flex items-center justify-between">
            <div>
              <p className="text-sm text-gray-500">Total Sales</p>
              <p className="text-2xl font-bold text-gray-900">$12,345</p>
            </div>
            <DollarSign className="h-8 w-8 text-blue-500" />
          </div>
          <div className="mt-4">
            <div className="text-sm text-green-600">+12.5%</div>
            <div className="text-xs text-gray-500">vs last month</div>
          </div>
        </div>

        <div className="bg-white p-6 rounded-lg shadow-md">
          <div className="flex items-center justify-between">
            <div>
              <p className="text-sm text-gray-500">Items Sold</p>
              <p className="text-2xl font-bold text-gray-900">1,234</p>
            </div>
            <Package className="h-8 w-8 text-blue-500" />
          </div>
          <div className="mt-4">
            <div className="text-sm text-green-600">+8.2%</div>
            <div className="text-xs text-gray-500">vs last month</div>
          </div>
        </div>

        <div className="bg-white p-6 rounded-lg shadow-md">
          <div className="flex items-center justify-between">
            <div>
              <p className="text-sm text-gray-500">Average Order Value</p>
              <p className="text-2xl font-bold text-gray-900">$45.67</p>
            </div>
            <TrendingUp className="h-8 w-8 text-blue-500" />
          </div>
          <div className="mt-4">
            <div className="text-sm text-red-600">-2.3%</div>
            <div className="text-xs text-gray-500">vs last month</div>
          </div>
        </div>

        <div className="bg-white p-6 rounded-lg shadow-md">
          <div className="flex items-center justify-between">
            <div>
              <p className="text-sm text-gray-500">Customer Satisfaction</p>
              <p className="text-2xl font-bold text-gray-900">4.8/5.0</p>
            </div>
            <BarChart3 className="h-8 w-8 text-blue-500" />
          </div>
          <div className="mt-4">
            <div className="text-sm text-green-600">+0.3</div>
            <div className="text-xs text-gray-500">vs last month</div>
          </div>
        </div>
      </div>

      <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
        <div className="bg-white p-6 rounded-lg shadow-md">
          <h2 className="text-lg font-semibold text-gray-900 mb-4">Top Selling Products</h2>
          <div className="space-y-4">
            {/* TODO: Implement top products chart */}
          </div>
        </div>

        <div className="bg-white p-6 rounded-lg shadow-md">
          <h2 className="text-lg font-semibold text-gray-900 mb-4">Sales Trend</h2>
          <div className="h-64">
            {/* TODO: Implement sales trend chart */}
          </div>
        </div>
      </div>
    </div>
  );
}

export default Reports;