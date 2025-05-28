import React from 'react';
import { useForm } from 'react-hook-form';
import { Bill } from '../types';

function Billing() {
  const { register, handleSubmit } = useForm();

  const onSubmit = async (data: any) => {
    // TODO: Implement billing submission
    console.log(data);
  };

  return (
    <div className="space-y-6">
      <h1 className="text-2xl font-semibold text-gray-900">Billing</h1>

      <div className="bg-white shadow-md rounded-lg p-6">
        <form onSubmit={handleSubmit(onSubmit)} className="space-y-6">
          <div className="grid grid-cols-2 gap-6">
            <div>
              <label className="block text-sm font-medium text-gray-700">
                Invoice Number
              </label>
              <input
                type="text"
                {...register('invoiceNumber')}
                className="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:border-blue-500 focus:ring-blue-500"
                readOnly
                value={`INV-${Date.now()}`}
              />
            </div>
            <div>
              <label className="block text-sm font-medium text-gray-700">
                Customer ID (Optional)
              </label>
              <input
                type="text"
                {...register('customerId')}
                className="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:border-blue-500 focus:ring-blue-500"
              />
            </div>
          </div>

          <div>
            <h3 className="text-lg font-medium text-gray-900 mb-4">Items</h3>
            <table className="min-w-full divide-y divide-gray-200">
              <thead className="bg-gray-50">
                <tr>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Product
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Quantity
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Price
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Subtotal
                  </th>
                  <th className="px-6 py-3 text-right text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Actions
                  </th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {/* TODO: Implement dynamic item rows */}
              </tbody>
            </table>

            <button
              type="button"
              className="mt-4 text-blue-600 hover:text-blue-900"
            >
              + Add Item
            </button>
          </div>

          <div className="flex justify-end space-x-4">
            <div className="text-right">
              <p className="text-sm text-gray-500">Total:</p>
              <p className="text-2xl font-bold text-gray-900">$0.00</p>
            </div>
            <button
              type="submit"
              className="bg-blue-600 text-white px-6 py-2 rounded-md hover:bg-blue-700"
            >
              Generate Bill
            </button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default Billing;